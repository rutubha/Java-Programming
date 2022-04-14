import java.util.ArrayList;

class MyStack extends ArrayList<Object> {
    private ArrayList<Object> list;

    public MyStack() {
        list = new ArrayList<Object>();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    public Object peek() {
        return list.get(0);
    }

    public Object pop() {
        Object o = list.get(0);
        list.remove(0);
        return o;
    }

    public void push(Object o) {
        list.add(0, o);
    }

    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }
}