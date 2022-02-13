package members;

public class MemberTwo extends MembersOne {
    public static void main(String[] args) {
        MembersOne membersOne = new MembersOne();
        membersOne.m1();

        MemberTwo memberTwo = new MemberTwo();
        memberTwo.m1();

        MembersOne membersOne1 = new MemberTwo();
        membersOne1.m1();
    }
}
