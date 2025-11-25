crafting.removeByOutput(item('wopper:wopper'))
crafting.addShaped('wopper', item('wopper:wopper'), [
 [ore('plankWood'), null, ore('plankWood')],
 [ore('plankWood'), item('minecraft:chest'), ore('plankWood')],
 [ore('craftingToolSaw'), ore('plankWood'), ore('craftingToolSoftHammer')]])