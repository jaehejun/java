package java0711;

interface GeneralBook {
    int size(String[] names);
    String names();
    String records();
    boolean nameExist(String name);
    void add(String name, String record);
    void remove(String name, String record);
    String get(String name);
    void sort();
    void print();
}
public class ArrayedGeneralBook implements GeneralBook {
    private String[] names;
    private String[] records;

    public ArrayedGeneralBook(String[] names, String[] records) {
        this.names = names;
        this.records = records;
    }

    public int size(String[] names) {
        return this.names.length;
    }
    public String names() {
        String res = "";
        for (int i = 0; i < names.length; i++) {
            res += names[i] + " ";
        }
        return res;
    }

    public String records() {
        String res = "";
        for (int i = 0; i < records.length; i++) {
            res += records[i] + " ";
        }
        return res;
    }

    public boolean nameExist(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void add(String name, String record) {
        if (nameExist(name)) {
            System.out.println(name + " already exists");
            return;
        }
        int addIndex = 0;
        while (addIndex < names.length && names[addIndex].compareTo(name) < 0)
            addIndex++;

        String[] newNames = new String[names.length + 1];
        String[] newRecords = new String[records.length + 1];

        for (int i = 0; i < addIndex; i++) {
            newNames[i] = names[i];
            newRecords[i] = records[i];
        }

        newNames[addIndex] = name;
        newRecords[addIndex] = record;

        for (int i = addIndex; i < names.length; i++) {
            newNames[i + 1] = names[i];
            newRecords[i + 1] = records[i];
        }
        names = newNames;
        records = newRecords;
    }

    public void remove(String name, String record) {
        if (!nameExist(name)) {
            System.out.println(name + " does not exist!!");
            return;
        }
        int removeIndex;
        for (removeIndex = 0; removeIndex < names.length; removeIndex++) {
            if (names[removeIndex].equals(name)) {
                break;
            }
        }

        String[] newNames = new String[names.length - 1];
        String[] newRecords = new String[records.length - 1];

        int newIdx = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == removeIndex) continue;
            newNames[newIdx] = names[i];
            newRecords[newIdx] = records[i];
            newIdx++;
        }
        names = newNames;
        records = newRecords;
    }

    public String get(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return records[i];
            }
        }
        return null;
    }

    public void sort() {
        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String tempName = names[i];
                names[i] = names[minIndex];
                names[minIndex] = tempName;

                String tempRecord = records[i];
                records[i] = records[minIndex];
                records[minIndex] = tempRecord;
            }
        }
    }

    public void print() {
        sort();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + records[i]);
        }
    }
}

class BookEx {
    public static void main(String[] args) {
        String[] names = {"Sam", "Rhee", "Kim"};
        String[] records = {"1111", "2222", "3333"};
        ArrayedGeneralBook gb = new ArrayedGeneralBook(names, records);

        System.out.println(gb.names());

        gb.add("Allan", "4444");
        gb.print();

        System.out.println("현재 저장된 데이터의 크기: " + gb.size(names));
        gb.add("Alex", "5555");
        System.out.println("현재 저장된 데이터의 크기: " + gb.size(names));
        gb.print();
        System.out.println(gb.nameExist("Alex"));

        gb.remove("Alex", "5555");
        gb.remove("Sam", "1111");

        gb.print();

        String foundRecord = gb.get("Allan");
        System.out.println(foundRecord);
    }
}