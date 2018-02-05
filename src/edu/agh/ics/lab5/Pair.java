package edu.agh.ics.lab5;

import java.io.Serializable;
import org.apache.log4j.Logger;

public class Pair<T> implements Serializable {
	
	public static Logger log = Logger.getLogger(Pair.class);
	
	private T first;
	private T second;
	
	public Pair (T first, T second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public void setFirst(T first) {
		this.first = first;
	}

	public T getSecond() {
		return second;
	}

	public void setSecond(T second) {
		this.second = second;
	}
	
	public void swap() {
		T tmp = first;
		first = second;
		second = tmp;
	}
		

	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
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
		Pair other = (Pair) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		Pair<Integer> pia = new Pair<>(1, 2);
		Pair<Integer> pib = new Pair<>(1, 2);
		log.info("Equals: " + pia.equals(pib));
		log.info("Hash code: " + pia.hashCode() + ", " + pib.hashCode());
		pib.swap();
		log.info("Equals: " + pia.equals(pib));
		log.info("Hash code: " + pia.hashCode() + ", " + pib.hashCode());
		Pair<String> psa = new Pair<>("Ala", "Ola");
		log.info(psa);
		psa.swap();
		log.info(psa);
	}
}
