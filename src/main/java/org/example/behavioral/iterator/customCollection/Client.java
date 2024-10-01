package org.example.behavioral.iterator.customCollection;

public class Client {

    public static void main(String[] args) {
        BizhanCollection<String> bizhanCollection = new BizhanCollection<>();
        bizhanCollection.add("hello");
        bizhanCollection.add("world");
        bizhanCollection.add("this ");
        bizhanCollection.add("is");
        bizhanCollection.add("Bizhan");

        Iterator<String> iterator = bizhanCollection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        BizhanCollection<User> userCollection = new BizhanCollection<>();
        userCollection.add(new User.Builder().setAge(52).setName("bizhan laripour").build());
        userCollection.add(new User.Builder().setAge(36).setName("akbar mohammadi").build());
        userCollection.add(new User.Builder().setAge(22).setName("asghar javadi").build());
        userCollection.add(new User.Builder().setAge(50).setName("david linch").build());

        Iterator<User> iterator2 = userCollection.createIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next().getName() + " " + iterator2.next().getAge());
        }
    }
}
