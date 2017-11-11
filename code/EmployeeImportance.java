import java.util.*;

public class EmployeeImportance {
    public static void main(String[] args) {

    }
}

// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        // 由题知这是一个树状结构，利用递归即可。
        Employee em = null;
        for (int i = 0; i < employees.size(); i++)
            if (employees.get(i).id == id) {
                em = employees.get(i);
                break;
            }
        if (em == null || em.subordinates.isEmpty()) return em.importance;

        int result = em.importance;
        for (int i = 0; i < em.subordinates.size(); i++) {
            result += getImportance(employees, em.subordinates.get(i));
        }

        return result;
    }
}
