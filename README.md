SRW MX Portable Unit Editor by Dashman
-----------------------------------------

This program allows you to edit unit and weapon data from SRW MX Portable stored in one of its files. Most unit data is available for edition. Weapon data is missing the choice between melee / melee+ranged / ranged and stuff related to combination attacks (units participating and weapons involved in the attack power).

You'll need to have Java installed in your computer for this program to work.


How to use this
---------------

1) Extract the file STATIC2_ADD.BIN from the folder PSPGAME/USRDIR inside the ISO.
2) Start the application. Use File->Open... to open the extracted file. This will load the unit data.
3) Make any changes to the units that you want.
4) When you're done editing, use File->Patch unit data... and browse the same file you extracted. Your changes will be saved there (keep a clean copy somewhere, just in case).
5) Get yourself the program UMDGen. Open your MX Portable ISO with it and drag your edited STATIC2_ADD.BIN file into its corresponding folder (overwrite the file). Save as (a different) uncompressed ISO.
6) Play the game, see the changes.


IMPORTANT NOTES
-------

* MAKE BACKUPS!!!!

* The rules for some of the unit / weapon properties are still not completely clear and this tool MIGHT overwrite important info about those, so I'll say it again: MAKE BACKUPS!!!!

* The real value of "Reward PP" is always 1 more than what is shown. So, a MiniFO gives 2 PP even though it shows a 1 in that field.

* Some weapons have their "Beam" property active even though they're not listed in the game as beam weapons (like the Breast Fire). It's better to leave these as "Beam", just in case.

* There's a lot of units with all their data set to 0, probably dummies. They've concentrated in big gaps between existing units. I list their locations here, so you can avoid those:
	- 158 ~ 200
	- 340 ~ 400
	- 412 ~ 450
	- 465 ~ 512

* Not all units are identified yet. Please help identify them (mostly enemies) in the thread or akurasu.

* Regarding limits in the values:

	- HP is 4 bytes long, so technically it could be absurdly big. However, knowing these games, the max HP is probably 2147483647 (7fffffff).

	- EN, armor, repair cost, reward cash and weapon power are 2 bytes long, so max should be 65535 (ffff) or 32767 (7fff).

	- Mobility, movement, reward PP and all weapon numeric properties other than power are 1 byte long, so the max is 255. Of course, a will requirement over 150 make a weapon unusable (unless there's will limit break in this game, in which case 170 is the max for that).
	
* You'll have noticed the terrain movement ratings don't have C or S among their options. That's because there's no unit in the game with such rating, although it's probably possible to assign an S rate (but not a C).

* Information about the known bits of the unit and weapon data can be found here (search the document for "Unit" and "Weap"): http://pastebin.com/zYV0JzWM