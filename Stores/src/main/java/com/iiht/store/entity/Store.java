package com.iiht.store.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Store")
public class Store {
	
	private ArrayList<Egg> eggList;
	private HashSet<Milk> milkSet;
	private LinkedList<Chocolate> chocolateList;
	private TreeSet<Apple> appleSet;
	private Queue<Bread> breadQueue;
	
	public Store() {
		this.eggList = new ArrayList<>();
		this.milkSet = new HashSet<>();
		this.chocolateList = new LinkedList<>();
		this.appleSet = new TreeSet<>();
		this.breadQueue = new LinkedList<>();
	}
	
	public void addEgg(Egg egg) {
		eggList.add(egg);
	}
	
	public void addMilk(Milk milk) {
		milkSet.add(milk);
	}
	
	public void addChocolate(Chocolate chocolate) {
		chocolateList.add(chocolate);
	}
	
	public void addApple(Apple apple) {
		appleSet.add(apple);
	}
	
	public void addBread(Bread bread) {
		breadQueue.add(bread);
	}

}
