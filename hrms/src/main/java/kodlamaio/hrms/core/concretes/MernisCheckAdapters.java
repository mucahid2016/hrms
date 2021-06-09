package kodlamaio.hrms.core.concretes;

import java.rmi.RemoteException;

import kodlamaio.hrms.core.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapters  implements MernisCheckService{

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(jobSeeker.getNationalityNumber()), 
						jobSeeker.getFirstName(), 
						jobSeeker.getLastName(), 
						jobSeeker.getYearOfBirth());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
