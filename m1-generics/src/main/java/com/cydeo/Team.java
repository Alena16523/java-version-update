package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> { //should accept only Player and subclasses, not every data type

    private String name;
    private List<T> members=new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(((Player)player).getName()+" is already on the team");
            //casting player as there is no specific data type <T>
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName()+" picked for the team "+ this.name);
            return true;
        }
    }
}
