package project02;

public class MyQueue {
	
	private int[] elements;
	
	public MyQueue()
	{
		elements=new int[0];
	}
	
	
	//���
	public void add(int data)
	{   
		int[] newArr=new int[elements.length+1];
		for(int i=0;i<elements.length;i++)
		{
			newArr[i]=elements[i];
		}
		newArr[elements.length]=data;
		
		elements=newArr;
	}
	
	//����
	public int poll()
	{   
		if(!isEmply())
		{
			
		int pollData=elements[0];
		
		int[] newArr=new int[elements.length-1];
		
		for(int i=0;i<elements.length-1;i++)
		{
			newArr[i]=elements[i+1];
		}
		elements=newArr;
		return pollData;
		}
		else {
			throw new RuntimeException("����Ϊ��");
		}
		
		
		
	}
	
	//�Ƿ�Ϊ��
	public boolean isEmply()
	{
		return elements.length==0;
	}
	
	
	//�鿴��ͷԪ��
	public int peek()
	{
		return elements[0];
	}

}
