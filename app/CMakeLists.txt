# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

include_directories(src/main/cpp)

#设定一个目录
aux_source_directory(src/main/cpp SRC_LIST)

#将前面目录下所有的文件都添加进去
add_library(bsdiff SHARED src/main/cpp/bsdiff.c ${SRC_LIST})


find_library(log-lib log)

target_link_libraries(bsdiff ${log-lib})