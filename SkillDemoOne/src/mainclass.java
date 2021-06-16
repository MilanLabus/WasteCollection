


/*
 * Author:   Milan Labus
 * Date:     25th November 2019
 * 
 * This program reads in the customers weekly waste weight
 * in each waste type and outputs the yearly cost per kg for
 * each waste type as well as the Total Annual cost for each company
 * 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class mainclass {

	public static void main(String[] args) {
		
        Scanner keyboard = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		// Here is the code for the user to input their measurements
		
		
		System.out.println("Enter General weekly Waste weight: ");
		float generalWaste = keyboard.nextFloat();
		
		System.out.println("Enter the weekly Recycling waste: ");
		float recyclingWaste = keyboard.nextFloat();
		
		System.out.println("Enter the weekly Organic waste: ");
		float organicWaste = keyboard.nextFloat();
		
		System.out.println("Enter the weekly Glass waste: ");
		float glassWaste = keyboard.nextFloat();
		
		System.out.println("\u250c\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510");
		System.out.println("\u2502 General waste weight:  " +  df.format(generalWaste) + " kg\t\t\t\t\t\t\t               \u2502");
		System.out.println("\u2502 Recyling Waste weight: " + df.format(recyclingWaste) + " kg\t\t\t\t\t\t                       \u2502");
		System.out.println("\u2502 Organic waste weight:  " + df.format(organicWaste) + " kg\t\t\t\t\t\t                       \u2502");
		System.out.println("\u2502 Glass waste weight:    " + df.format(glassWaste) + " kg\t\t\t\t\t\t\t               \u2502");
		System.out.println("\u2502 \t\t\t\t\t\t\t\t\t\t\t\t       \u2502");
		System.out.println("\u2502 Company name        General Waste   Recycling Weight   Organic Waste    Glass Waste    Total Cost    \u2502");
		System.out.println("\u2502\t\t       Cost\t      Cost\t         Cost\t          Cost\t         (Per Annum)   \u2502");
		
		
		//Calculations for Green Clean
		
		float generalCost1 = (generalWaste*52)*.21f;
		float recyclingCost1 = 0;
		float organicCost1 = (organicWaste*52)*.10f;
		float glassCost1 = (glassWaste*52)*.15f;
		float totalCost1 = generalCost1 + recyclingCost1 + organicCost1 + glassCost1 + 180;
		
		//calculations for Country Collect
		
		float generalCost2 = (generalWaste*52)*.14f;
		float recyclingCost2 = (recyclingWaste*52)*.14f;
		float organicCost2 = (organicWaste*52)*.10f;
		float glassCost2 = (glassWaste*52)*.12f;
		float totalCost2 = generalCost2 + recyclingCost2 + organicCost2 + glassCost2 + 120;
		
		//calculations for Enviro
		
		float generalCost3 = (generalWaste*52)*.30f;
		float recyclingCost3 = 0;
		float organicCost3 = 0;
		float glassCost3 = 0;
		float totalCost3 = generalCost3 + recyclingCost3 + organicCost3 + glassCost3 + 150;
		
		//calculations for Waste Away
		
		float generalCost4 = (generalWaste*52)*.10f;
		float recyclingCost4 = (recyclingWaste*52)*.10f;
		float organicCost4 = (organicWaste*52)*.10f;
		float glassCost4 = (glassWaste*52)*.10f;
		float totalCost4 = generalCost4 + recyclingCost4 + organicCost4 + glassCost4 + 200;
		
		//Annual costs for each company displayed
		
		System.out.println("\u2502 Green Clean          €"+df.format(generalCost1)+"           €" + df.format(recyclingCost1) +"             €"+df.format(organicCost1)+"            €"+df.format(glassCost1)+"         €"+df.format(totalCost1)+"     \u2502");
		System.out.println("\u2502 Country Collect      €"+df.format(generalCost2)+"          €" + df.format(recyclingCost2) +"             €"+df.format(organicCost2)+"            €"+df.format(glassCost2)+"         €"+df.format(totalCost2)+"     \u2502");
		System.out.println("\u2502 Enviro              €"+df.format(generalCost3)+"           €" + df.format(recyclingCost3) +"              €"+df.format(organicCost3)+"             €"+df.format(glassCost3)+"         €"+df.format(totalCost3)+"     \u2502");
		System.out.println("\u2502 Waste Away           €"+df.format(generalCost4)+"          €" + df.format(recyclingCost4) +"             €"+df.format(organicCost4)+"            €"+df.format(glassCost4)+"         €"+df.format(totalCost4)+"     \u2502");
		System.out.println("\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518");
		
		
		keyboard.close();
	}

}

