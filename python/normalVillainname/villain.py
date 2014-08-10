#DIOFEL S. PALLEGA
#CSC 181 
#3rd YEAR

def what(month,day,color):
    days = ('blank','Gargoyle','Goblin','Creature','King/Queen','Witch/Warlock','Guardian','Fairy','Knight','Elf','Assassin','Sorcerer/Sorceress','Giant','Werewolf','Wizard','Ogre','Beast','Dragon','Ghost','Dwarf','Unicorn','Warrior','Spirit','Thief','Mermaid/Merman','Cyclops','Troll','Orc','Pirate','Vampire','Prince/Princess','Serpent')
    #colors = ('of the Night','of the Seas','of the Forest','of the North','of the Shadows','of the Dead','of the East','of the West','of the Desert','of the South','of the Mountains') 
    
    if month == 'january':
        v = "The Black"
    elif month == 'february':
        v = "The Vengeful"
    elif month == 'march':
        v = "The Dark"
    elif month == 'april':
        v = "The Red"
    elif month == 'may':
        v = "The Cursed"
    elif month == 'june':
        v = "The Savage"
    elif month == 'july':
        v = "The White"
    elif month ==  'august':
        v = "The Ugly"
    elif month == 'september':
        v = "The Treacherous"
    elif month == 'october':
        v = "The Blue"
    elif month == 'november':
        v = "The Wicked"
    else :
        v = "The Green"
    
    colorss = {}
    colorss['red'] = 'of the night'
    colorss['blue'] = 'of the Seas'
    colorss['green'] = 'of the Forest'
    colorss['white'] = 'of the North'
    colorss['black'] = 'of the Shadows'
    colorss['yellow'] = 'of the Dead'
    colorss['purple'] = 'of the East'
    colorss['orange'] = 'of the West'
    colorss['brown'] = 'of the Desert'
    colorss['cyan'] = 'of the South'
    colorss['pink'] = 'of the Mountains'
    x = days[day] 
    #print "Your Villain Name Is",v,x,colorss[color]  
    return   v+" "+x+" "+colorss[color]  

print what('january',11,'yellow')

