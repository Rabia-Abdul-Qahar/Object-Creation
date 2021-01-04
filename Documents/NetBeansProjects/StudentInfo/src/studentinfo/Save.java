/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentinfo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Save {
      ArrayList<String>  obj=new ArrayList<String>();
       
      public void adding(String s)
               
	{
		obj.add(s);
	}

    public void deleting(int index)
	{
            obj.remove(index);
	}


    public void view()
	{
            for(String element: obj)
            {
                System.out.println(element);
            }
//           for(int i=0;i<obj.size() ;i++)
//           {
//              System.out.println(obj.get(i) );
//           }
	}

    public void exit()
	{
		System.exit(0);
	}
}
