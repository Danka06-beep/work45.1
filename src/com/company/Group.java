package com.company;

public enum Group  {
    Work,
    FRIENDS,
    FAMILY;

    static Group getEnum(String group){
        switch (group){
            case("работа"):
                return Work;
            case ("друзья"):
                return  FRIENDS;
            case("семья"):
                return FAMILY;
        }
        return null;
    }
}
