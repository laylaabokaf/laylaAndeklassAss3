package bgu.spl.net.impl.BGRSServe;

import bgu.spl.net.srv.BaseServer;
import bgu.spl.net.srv.Server;

public class TPCMain {
    public static void main(String[] args) {
//Integer.parseInt(args[0])
        Database myData=Database.getInstance();
        myData.initialize("./Courses.txt");
      Server.threadPerClient(7770,()->new BGRProtocol(),()->new BGRMessageEcoderDecoder()).serve();

    }
}
