package com.eduard.patterns.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class TreeDecorator implements ChristmasTree {
    private ChristmasTree tree;

    @Override
    public String decorate() {
        return tree.decorate();
    }
}
