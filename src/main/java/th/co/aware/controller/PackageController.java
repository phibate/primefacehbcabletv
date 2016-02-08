package th.co.aware.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import th.co.aware.bo.PackageBO;
import th.co.aware.model.PackageCTV;

@ManagedBean(name="packageController")
@SessionScoped
public class PackageController implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{PackageBOImpl}")
	private PackageBO packageImpl;

	private List<PackageCTV> packageCTVs;

	private PackageCTV packageCTV = new PackageCTV();

	@PostConstruct
	public void init() {
		this.setPackageCTVs(packageImpl.findAll());
	}

	public PackageBO getPackageImpl() {
		return packageImpl;
	}

	public void setPackageImpl(PackageBO packageImpl) {
		this.packageImpl = packageImpl;
	}

	public List<PackageCTV> getPackageCTVs() {
		return packageCTVs;
	}

	public void setPackageCTVs(List<PackageCTV> packageCTVs) {
		this.packageCTVs = packageCTVs;
	}

	public PackageCTV getPackageCTV() {
		return packageCTV;
	}

	public void setPackageCTV(PackageCTV packageCTV) {
		this.packageCTV = packageCTV;
	}
	
	public String addPackage() {
		packageImpl.addPackage(packageCTV);
        FacesContext.getCurrentInstance().addMessage(null,
                     new FacesMessage("The Package " + this.packageCTV.getName() + " Is Add Successfully"));
        init();
        return "";
	}
	
	public String deletePackage() {
		String packageDelete = this.packageCTV.getName();
		packageImpl.deletePackage(packageCTV);
        FacesContext.getCurrentInstance().addMessage(null,
                     new FacesMessage("The Package " + packageDelete + " Is Delete Successfully"));
        init();
        return "";
	}
	

}
