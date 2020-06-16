package fruit_linkedlist;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class fruit {
    String name;
    String colur;
    float weight;
    int fullempty=-1;
    int next=-1;
    public fruit(String name,String colur,float weight,int fullempty,int next)
    {
        this.name=name;
        this.colur=colur;
        this.weight=weight;
        this.fullempty=fullempty;
        this.next=next;
    }
    public fruit(String name,String colur,float weight,int fullempty)
    {
        this.name=name;
        this.colur=colur;
        this.weight=weight;
        this.fullempty=fullempty;
        this.next=-1;
    }
    public fruit()
    {
        this.name="";
        this.colur="";
        this.weight=0;
        this.fullempty=-1;
        this.next=-1;
    }
    public int getnext()
    {
        fruit f=this;
        return f.next;
    }
    public void setnext(int a)
    {
        fruit f=this;
        f.next=a;
    }
    public int getfullempty()
    {
        return fullempty;
    }
    public void setfullempty(int a)
    {
        this.fullempty=a;
    }
    public String print(int a)
    {
        fruit f=this;
        String s="fruit"+a+": \n name: "+f.name+"\t color: "+f.colur+"\t weight: "+f.weight+"\n";   
        return s;
    }
}
