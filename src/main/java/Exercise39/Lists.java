/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lists {
    public List<Map<String, String>> testMap() {
        List<Map<String,String>> Employees = new ArrayList<Map<String,String>>();
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("1", "Jacquelyn Jackson");
        map1.put("2","Jake Jacobson ");
        map1.put("3","John Johnson ");
        map1.put("4","Michaela Michaelson ");
        map1.put("5","Sally Weber  ");
        map1.put("6","Tou Xiong ");
        //for (int i = 0;i < map1.size();++i){
        //System.out.println(map1.);
        //}
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("DBA","");
        map2.put("Programmer","");
        map2.put("Manager","2016-12-31");
        map2.put("District Manager","2015-12-19");
        map2.put("Web Developer","2015-12-18");
        map2.put("Software Engineer","2016-10-05");

        Employees.add(1,map1);
        Employees.add(2,map2);
        return Employees;
    }

}
