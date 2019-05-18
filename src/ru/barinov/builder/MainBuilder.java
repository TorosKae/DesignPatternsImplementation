package ru.barinov.builder;

/**
 * 1) implementations of IBuilderPack interface
 *    define WHAT to build
 *    our products are:
 *    pack ready for travel
 *
 *    implementations define specifications of pack
 *    strong or light
 *    women or man
 * 2) there are several steps for building:
 *      choose the pack
 *      take clothes
 *      take food
 *      take bivouak (tent + sleeping bag)
 *      take other stuff
 * 3) DirectorPack defines HOW to build
 *    Here is sets of stuff (stuff+tent)
 *    for hiking, for trekking
 *    Director supports several products
 *    cause it works with Interface IBuilderPack
 *    have no need to know product of builder
 */
public class MainBuilder {
    public static void main(String[] args) {

    }
}
