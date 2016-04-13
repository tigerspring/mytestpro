package org.test.commond.version3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.test.commond.version3.command.Command;

public class Waiter {

	private List<Command> orders = new ArrayList<Command>();
	
	public void setOrders(Command command){
		if(command.toString().equals("命令模式.烤鸡翅")){
			System.out.println("日志	服务员："+command.toString()+"，请点别的烧烤。");
		}else{
			orders.add(command);
			System.out.println("日志	增加订单："+command.toString()+"	时间："+new Date());
		}
	}
	
	public void cancelOrder(Command command){
		orders.remove(command);
		System.out.println("日志	取消订单："+command.toString() + "	时间："+new Date());
	}
	
	public void notifyX(){
		for(Command order : orders){
			order.excuteCommand();
		}
	}
}
