package java0710.shopEx;

public class Customer {
    private String name;
    private boolean member = false;
    private String memberType;

    // 생성자
    public Customer(String name, boolean isMember) {
        this.name = name;
        this.member = isMember;
    }

    // Getter
    public String getName() { return name; }
    public boolean isMember() { return member; }
    public String getMemberType() { return memberType; }

    // Setter
    public void setName(String name) { this.name = name; }
    public void setMember(boolean isMember) { this.member = isMember; }
    public void setMemberType(String memberType) { this.memberType = memberType; }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
    }
}
