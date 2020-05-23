package com.hervey.app;

public class Person {
	
		boolean covid19Status;
		boolean hasEnemies;
		boolean isFrail;
		boolean believesInChemtrails;
	
	int trueCounter = 0;
	
	public Person() {
		
	}
	
	public Person(boolean hasCovid19) {
		this.covid19Status = hasCovid19;
	}
	
	public Person(boolean hasCOVID19, boolean hasEnemies, boolean isFrail, boolean belivesInChemtrails) {
		//if this is the only constructor, then all persons must have these values
		
	}
	
	//this kind of uses decorator pattern


	public boolean isAnxiou() {
		//If half or more of parameters are true, then return true
		if(covid19Status) {
			trueCounter++;
		}
		
		if(hasEnemies) {
			trueCounter++;
		}
		
		if(isFrail) {
			trueCounter++;
		}
		
		if(believesInChemtrails) {
			trueCounter++;
		}
		
		if(trueCounter>2) {
			return true;
		}
		
		return false;
	}





	public void setHasEnemies(boolean hasEnemies) {
		this.hasEnemies = hasEnemies;
	}


	public void setFrail(boolean isFrail) {
		this.isFrail = isFrail;
	}

	public boolean isBelievesInChemtrails() {
		return believesInChemtrails;
	}

	public void setBelievesInChemtrails(boolean believesInChemtrails) {
		this.believesInChemtrails = believesInChemtrails;
	}

	public int getTrueCounter() {
		return trueCounter;
	}

	public void setTrueCounter(int trueCounter) {
		this.trueCounter = trueCounter;
	}

	public void setCovid19Status(boolean covid19Status) {
		this.covid19Status = covid19Status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (covid19Status ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (covid19Status != other.covid19Status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [Covid19Status=" + covid19Status + "]";
	}
	
	
	

}
