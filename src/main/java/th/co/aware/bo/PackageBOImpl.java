package th.co.aware.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import th.co.aware.dao.PackageDAO;
import th.co.aware.model.PackageCTV;

@Service("PackageBOImpl")
@Transactional(readOnly = true)
public class PackageBOImpl implements PackageBO {
	
	@Autowired
	private PackageDAO packageImplDAO;
	
	@Transactional(readOnly = false)
	public void addPackage(PackageCTV packageCTV) {
		packageImplDAO.addPackage(packageCTV);

	}
	
	@Transactional(readOnly = false)
	public void deletePackage(PackageCTV packageCTV) {
		packageImplDAO.deletePackage(packageCTV);

	}
	
	@Transactional
	public List<PackageCTV> findAll() {
		// TODO Auto-generated method stub
		return packageImplDAO.findAll();
	}

}
