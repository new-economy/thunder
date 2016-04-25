package network.thunder.core.etc;

import network.thunder.core.communication.ClientObject;
import network.thunder.core.communication.layer.middle.broadcasting.types.PubkeyIPObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by matsjerratsch on 22/01/2016.
 */
public class SeedNodes {
    static List<PubkeyIPObject> ipList = new ArrayList<>();
    public static List<ClientObject> nodeList = new ArrayList<>();

    public static List<PubkeyIPObject> getSeedNodes () {
        return ipList;
    }

    public static void setToTestValues () {
        ClientObject node = new ClientObject();
        node.init();
        node.host = "localhost";
        node.port = Constants.STANDARD_PORT;

        PubkeyIPObject seed1 = new PubkeyIPObject();
        seed1.hostname = "localhost";
        seed1.port = Constants.STANDARD_PORT;
        seed1.pubkey = node.pubKeyClient.getPubKey();

        ipList.clear();

        nodeList.add(node);
        ipList.add(seed1);
    }
}
