class C1 {
    C2 other;
    C1(C2 other) {
        this.other = other;
    }
}
  
class C2 {
    int x;
    C2(int x) {
        this.x = x;
    }
}

class Task1 {
    C2 first = new C2(10);
    C2 ex1 = new C2(3);
    C1 second = new C1(this.ex1);
    C1 third = new C1(this.first);
}