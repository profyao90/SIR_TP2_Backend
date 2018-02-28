package domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class SmartDevice {
	long id;
	Residence Residence;
	
	@Id
	@GeneratedValue
	
	public long getId(){
		return id;
		}
	
	public void setId(long id){
		this.id=id;
		}
	
	@ManyToOne
	public Residence getResidence(){return Residence;}
	
	public void setResidence(Residence residence){
		this.Residence=residence;
		
	}

}
