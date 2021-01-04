package bgu.spl.net.impl.BGRSServe;

import bgu.spl.net.srv.Server;

public class ReactorMain {

    public static void main(String[] args) {
//Integer.parseInt(args[0])
        Database myData=Database.getInstance();
        myData.initialize("./Courses.txt");
        Server.reactor( Runtime.getRuntime().availableProcessors(),7771,()->new BGRProtocol(),()->new BGRMessageEcoderDecoder()).serve();

    }
}

