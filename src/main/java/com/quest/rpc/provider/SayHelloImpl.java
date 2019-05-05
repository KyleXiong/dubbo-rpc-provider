package com.quest.rpc.provider;

import com.quest.rpc.api.SayHello;

public class SayHelloImpl implements SayHello {

	public void sayHello() {
		System.out.println("Say hello from class: com.quest.rpc.provider.SayHelloImpl");
	}

}
