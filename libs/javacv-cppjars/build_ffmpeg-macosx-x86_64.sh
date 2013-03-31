tar -xjvf ffmpeg-$FFMPEG_VERSION.tar.bz2
mv ffmpeg-$FFMPEG_VERSION ffmpeg-$FFMPEG_VERSION-macosx-x86_64
cd ffmpeg-$FFMPEG_VERSION-macosx-x86_64
./configure --enable-shared --enable-gpl --enable-version3 --enable-runtime-cpudetect --disable-stripping --extra-ldflags="-Wl,-headerpad_max_install_names"
make -j4
LIBS="libavcodec/libavcodec.54.dylib libavdevice/libavdevice.54.dylib libavfilter/libavfilter.3.dylib libavformat/libavformat.54.dylib libavutil/libavutil.52.dylib libpostproc/libpostproc.52.dylib libswresample/libswresample.0.dylib libswscale/libswscale.2.dylib"
strip $LIBS
BADPATH=/usr/local/lib
for f in $LIBS; do install_name_tool $f -id @rpath/`basename $f` \
        -add_rpath /usr/local/lib/ -add_rpath /opt/local/lib/ -add_rpath @loader_path/. \
        -change $BADPATH/libavcodec.54.dylib @rpath/libavcodec.54.dylib \
        -change $BADPATH/libavdevice.54.dylib @rpath/libavdevice.54.dylib \
        -change $BADPATH/libavfilter.3.dylib @rpath/libavfilter.3.dylib \
        -change $BADPATH/libavformat.54.dylib @rpath/libavformat.54.dylib \
        -change $BADPATH/libavutil.52.dylib @rpath/libavutil.52.dylib \
        -change $BADPATH/libpostproc.52.dylib @rpath/libpostproc.52.dylib \
        -change $BADPATH/libswresample.0.dylib @rpath/libswresample.0.dylib \
        -change $BADPATH/libswscale.2.dylib @rpath/libswscale.2.dylib; done
mkdir -p com/googlecode/javacv/cpp/macosx-x86_64/
cp $LIBS com/googlecode/javacv/cpp/macosx-x86_64/
jar cvf ../ffmpeg-$FFMPEG_VERSION-macosx-x86_64.jar com/
rm -Rf com/
cd ../
