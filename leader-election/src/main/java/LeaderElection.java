import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

public class LeaderElection implements Watcher {
    private static final String ZOOKEEPER_ADDRESS = "localhost:2181";
    private static final int SESSION_TIMEOUT=3000;
    private ZooKeeper zookeeper;
    public static void main(String[] args){

    }

    public void connectToZookeeper() throws IOException {
        this.zookeeper = new ZooKeeper(ZOOKEEPER_ADDRESS, SESSION_TIMEOUT, this);
    }
}
