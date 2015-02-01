package com.psk.concurrency.blockingqueue.arrayblockingqueue.producer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Producer는 3초마다 item을 집어넣는다.
 * Queue에 용량이 없을경우 wait한다.
 */
public class PutProducer implements Runnable {

	protected BlockingQueue queue = null;
	protected int interval;
	
	public PutProducer(BlockingQueue queue, int interval) {
		this.queue = queue;
		this.interval = interval;
	}

	public void run() {
		try {
			while (true) {
				queue.put("String Put :: " + ThreadLocalRandom.current().nextInt(0,1000));
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}