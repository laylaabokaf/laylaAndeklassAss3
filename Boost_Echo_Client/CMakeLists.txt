cmake_minimum_required(VERSION 3.15)
project(Boost_Echo_Client)

set(CMAKE_CXX_STANDARD 14)

include_directories(include)

add_executable(Boost_Echo_Client
        include/keyboardthread.h
        include/connectionHandler.h
        include/sockerthread.h
        include/protocol.h
        src/sockerthread.cpp
        src/connectionHandler.cpp
        src/echoClient.cpp
        src/keyboardthread.cpp
        src/protocol.cpp)