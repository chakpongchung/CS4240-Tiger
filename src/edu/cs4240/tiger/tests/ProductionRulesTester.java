package edu.cs4240.tiger.tests;

import java.util.ArrayList;
import java.util.List;

import edu.cs4240.tiger.parser.TigerClasses;
import edu.cs4240.tiger.parser.TigerProductionRule;

/**
 * @author Roi Atalla
 */
public class ProductionRulesTester {
	public static void main(String[] args) {
		for(TigerProductionRule rule : TigerProductionRule.values()) {
			for(List<TigerClasses> classes : rule.productions) {
				System.out.println(TigerProductionRule.printRule(rule, classes));
			}
		}
		
		System.out.println("\n");
		for(TigerProductionRule rule : TigerProductionRule.values()) {
			firsts(0, new ArrayList<>(), rule);
		}
	}
	
	private static void firsts(int indent, List<TigerProductionRule> rulesVisited, TigerProductionRule currentRule) {
		for(int i = 0; i < indent; i++) {
			System.out.print("   ");
		}
		
		System.out.print(currentRule);
		
		if(rulesVisited.contains(currentRule)) {
			System.out.println(" - already visited!");
		} else {
			System.out.println();
			
			rulesVisited.add(currentRule);
			
			currentRule.productions.forEach((classes) -> {
				if(classes.size() > 0 && classes.get(0) instanceof TigerProductionRule) {
					firsts(indent + 1, rulesVisited, (TigerProductionRule)classes.get(0));
				}
			});
		}
	}
}
