//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.21 at 12:18:32 AM CST 
//


package com.sdn.app;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.test package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.test
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Flow }
     * 
     */
    public Flow createFlow() {
        return new Flow();
    }

    /**
     * Create an instance of {@link Flow.Match }
     * 
     */
    public Flow.Match createFlowMatch() {
        return new Flow.Match();
    }

    /**
     * Create an instance of {@link Flow.Match.EthernetMatch }
     * 
     */
    public Flow.Match.EthernetMatch createFlowMatchEthernetMatch() {
        return new Flow.Match.EthernetMatch();
    }

    /**
     * Create an instance of {@link Flow.Instructions }
     * 
     */
    public Flow.Instructions createFlowInstructions() {
        return new Flow.Instructions();
    }

    /**
     * Create an instance of {@link Flow.Instructions.Instruction }
     * 
     */
    public Flow.Instructions.Instruction createFlowInstructionsInstruction() {
        return new Flow.Instructions.Instruction();
    }

    /**
     * Create an instance of {@link Flow.Instructions.Instruction.ApplyActions }
     * 
     */
    public Flow.Instructions.Instruction.ApplyActions createFlowInstructionsInstructionApplyActions() {
        return new Flow.Instructions.Instruction.ApplyActions();
    }

    /**
     * Create an instance of {@link Flow.Instructions.Instruction.ApplyActions.Action }
     * 
     */
    public Flow.Instructions.Instruction.ApplyActions.Action createFlowInstructionsInstructionApplyActionsAction() {
        return new Flow.Instructions.Instruction.ApplyActions.Action();
    }

    /**
     * Create an instance of {@link Flow.Match.EthernetMatch.EthernetType }
     * 
     */
    public Flow.Match.EthernetMatch.EthernetType createFlowMatchEthernetMatchEthernetType() {
        return new Flow.Match.EthernetMatch.EthernetType();
    }

    /**
     * Create an instance of {@link Flow.Match.EthernetMatch.EthernetDestination }
     * 
     */
    public Flow.Match.EthernetMatch.EthernetDestination createFlowMatchEthernetMatchEthernetDestination() {
        return new Flow.Match.EthernetMatch.EthernetDestination();
    }

    /**
     * Create an instance of {@link Flow.Instructions.Instruction.ApplyActions.Action.OutputAction }
     * 
     */
    public Flow.Instructions.Instruction.ApplyActions.Action.OutputAction createFlowInstructionsInstructionApplyActionsActionOutputAction() {
        return new Flow.Instructions.Instruction.ApplyActions.Action.OutputAction();
    }

    /**
     * Create an instance of {@link Flow.Instructions.Instruction.ApplyActions.Action.SetQueueAction }
     * 
     */
    public Flow.Instructions.Instruction.ApplyActions.Action.SetQueueAction createFlowInstructionsInstructionApplyActionsActionSetQueueAction() {
        return new Flow.Instructions.Instruction.ApplyActions.Action.SetQueueAction();
    }

}
