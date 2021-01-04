//
// Created by spl211 on 22/12/2020.
//
#include "sockerthread.h"
#include "connectionHandler.h"
#include <iostream>

using namespace std;
sockerthread::sockerthread(protocol* protocol, ConnectionHandler* connect):Protocol(protocol),Connect(connect) {}

void sockerthread::doing() {
    while(Protocol->isonline()){
        char answer[1024];
        Connect->getFromBytes(answer);
        //make it a frame
        Protocol->doing(answer);
    }
}