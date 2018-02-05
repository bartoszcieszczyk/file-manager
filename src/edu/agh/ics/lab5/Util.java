package edu.agh.ics.lab5;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;

public class Util {
	
	public static Logger log = Logger.getLogger(Util.class);
	
	public static <T extends Serializable> Map<T, Integer> getFrequencies(List<T> list) {
		Map<T, Integer> map = new HashMap<>();
		for(T element : list) {
			if(map.containsKey(element)) {
				map.put(element, map.get(element) + 1);
			} else {
				map.put(element, 1);
			}
		}
		return map;
	}
	
	public static void main(String[] args) {
		List<Integer> ilist = Arrays.asList(1,3,1,4,3,3,3,2,1,1);
		List<String> slist = Arrays.asList("ala", "ola", "ela", "olo", "ola", "ala", "ala");
		List<Pair<String>> plist = Arrays.asList(new Pair<String>("Jan", "Kowalski"), new Pair<String>("Piotr", "Nowak"));
		
		Map<Integer, Integer> map = Util.getFrequencies(ilist);
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			log.info(entry.getKey() + " : " + entry.getValue());
		}
		
		Map<String, Integer> smap = Util.getFrequencies(slist);
		for(Entry<String, Integer> entry : smap.entrySet()) {
			log.info(entry.getKey() + " : " + entry.getValue());
		}
		
		Map<Pair<String>, Integer> pmap = Util.getFrequencies(plist);
		for(Entry<Pair<String>, Integer> entry : pmap.entrySet()) {
			log.info(entry.getKey() + " : " + entry.getValue());
		}
	}

}
