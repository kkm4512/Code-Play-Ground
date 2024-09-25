package SOLID.computer;

class Computer extends Machine{
    public void playComputer() {
        System.out.println("컴퓨터를 합니다");
    }
}

class Mouse extends Machine{
    public void playMouse() {
        System.out.println("마우스를 합니다");
    }
}

class Machine {
    public void on() {
        System.out.println("전원을 킵니다");
    }
}
