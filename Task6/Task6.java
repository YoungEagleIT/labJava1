package Laba_1.Task6;

import Laba_1.Task6.User.User;

public class Task6 {
    public static void main(final String[] args) {
        final User user = new User ();
        final User user1 =  new User ( "Nazar","Halkovych",19,"Nazar.Halkovych@gmail.com");
        System.out.println("Чи вони однакові:"+user.equals(user1));
        System.out.println("hashCode user:"+user.hashCode());
        System.out.println("hashCode user1:"+user1.hashCode());
    }
}
