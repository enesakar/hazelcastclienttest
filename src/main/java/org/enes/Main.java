package org.enes;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;

public class Main {

    public static void main(String[] args) {
        HazelcastInstance client = HazelcastClient.newHazelcastClient();
    }
}
