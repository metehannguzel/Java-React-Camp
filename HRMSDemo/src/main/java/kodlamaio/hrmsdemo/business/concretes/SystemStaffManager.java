package kodlamaio.hrmsdemo.business.concretes;

import kodlamaio.hrmsdemo.business.abstracts.SystemStaffService;
import kodlamaio.hrmsdemo.dataAccess.abstracts.SystemStaffDao;
import kodlamaio.hrmsdemo.entities.concretes.SystemStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemStaffManager implements SystemStaffService {
    private SystemStaffDao systemStaffDao;

    @Autowired
    public SystemStaffManager(SystemStaffDao systemStaffDao) {
        this.systemStaffDao = systemStaffDao;
    }

    @Override
    public List<SystemStaff> getAll() {
        return systemStaffDao.findAll();
    }
}
