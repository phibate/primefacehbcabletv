package th.co.aware.dao;

import java.util.List;

import th.co.aware.model.PackageCTV;

public interface PackageDAO {
	
	public void addPackage(PackageCTV packageCTV);
	
	public void deletePackage(PackageCTV packageCTV);

	public List<PackageCTV> findAll();
}
