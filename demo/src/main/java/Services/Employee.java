package Services;

import org.springframework.stereotype.Service;

@Service
public interface Employee {
    public String getName(String name);
    public double getSalary(int empId);

}
