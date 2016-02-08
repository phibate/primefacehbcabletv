package th.co.aware.bo;

import java.util.List;

import th.co.aware.model.PackageCTV;

public interface PackageBO {
	
	public void addPackage(PackageCTV packageCTV);
	
	public void deletePackage(PackageCTV packageCTV);

	public List<PackageCTV> findAll();
}
