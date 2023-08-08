package Aug8Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface DigitalTree {
	int absorbSunlight(int hours);
	String getTreeDetails();
}
class ForestManager {
	private int binaryCount=0;
	private int quantumCount=0;
	private int neuralTreeCount=0;
	int binaryEnergy=0;
	int quantumEnergy=0;
	int neuralEnergy=0;
	List<String> treeName=new ArrayList<String>();
	void AddTrees(int binary,int quantum, int neuralTree,List<String> trres) {
		this.binaryCount=binary;
		this.quantumCount=quantum;
		this.neuralTreeCount=neuralTree;
		this.treeName= trres;
	}
	
	int produceEnergyForForests(int hours) {
		int totalEnergy = 0;
		int tempBinaryEnergy=2*hours;
		tempBinaryEnergy=this.binaryCount*tempBinaryEnergy;
		this.binaryEnergy=tempBinaryEnergy;
		
		int tempQuantumEnergy=(hours*hours)*3;
		tempQuantumEnergy=tempQuantumEnergy*this.quantumCount;
		this.quantumEnergy=tempQuantumEnergy;
		
		int tempNeuralEnergy=hours*hours*hours;
		tempNeuralEnergy=tempNeuralEnergy*this.neuralTreeCount;
		this.neuralEnergy=tempNeuralEnergy;
		
		totalEnergy=tempBinaryEnergy+tempQuantumEnergy+tempNeuralEnergy;
		
		return totalEnergy;
	}
	
	int getForestReport() {
		for(int i=0;i<this.treeName.size();i++)
		{
			System.out.print(this.treeName.get(i)+" - Energy: ");
			if(this.treeName.get(i).contains("Binary"))
			{
				System.out.print(this.binaryEnergy/this.binaryCount);
				System.out.println();
			}
			if(this.treeName.get(i).contains("Quantum"))
			{
				System.out.print(this.quantumEnergy/this.quantumCount);
				System.out.println();
			}
			if(this.treeName.get(i).contains("Neural"))
			{
				System.out.print(this.neuralEnergy/this.neuralTreeCount);
				System.out.println();
			}
			
		}
		return this.binaryEnergy+this.quantumEnergy+this.neuralEnergy;
	}
}
public class ques4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> treeName=new ArrayList<String>();
		int binaryCount=0;
		int quantumCount=0;
		int neuralCount=0;
		for(int i=0;i<n;i++) {
			String temp=sc.next();
			treeName.add(temp);
			if(temp.contains("Binary")) {
				binaryCount=binaryCount+1;
			}
			if(temp.contains("Quantum")) {
				quantumCount=quantumCount+1;
			}
			if(temp.contains("Neural")) {
				neuralCount=neuralCount+1;
			}
		}
//		System.out.print("Hours");
		int hours=sc.nextInt();
		ForestManager forest=new ForestManager();
		forest.AddTrees(binaryCount,2,0,treeName);
		System.out.println(forest.produceEnergyForForests(hours));
		System.out.println("Total Energy Produced: "+forest.getForestReport());
		// TODO Auto-generated method stub

	}

}
