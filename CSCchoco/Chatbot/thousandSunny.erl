-module(thousandSunnyGo).
-compile(export_all).

 %% Mr.Tu quoque
 %% Mr.hypocrite 
 %% Mr.KnownotAll
 
send(Message) -> sendh(Message,spawn(?MODULE,reply,[]) ).
sendh(Message,SievePid ) -> SievePid ! {self(),Message,send},
        receive 
		    Result -> Result
			end.
	 

reply()-> 

      Greets =  ["Hello, what do you need?" ," what's up ,may I help you?","Hello fella , how's your day ?" ,"Hey , what's up stranger ?","Halo, how's your day?","halo!,how is your day ?"],
	  Greet = ["Hi", "Hello","hello","hi","halo","Halo"],
	  Hows = ["Oh, good to hear that !  so why are you here by the way?"," Great,do you have problems ? Is there anything I can do to help ?"," Good, can I help you?"],
	  Ans = ["yes","yes there is","Yes,there is","Yes","sure","yes there is","Yes there is"," Yes of course"],
	  Ans2 = ["Then what is your problem ? Are you sick?", "Then share your problems with me?"," Then don't be shy, what is your problem?","So ,what kind of problem do you have? love ,money,school,peer problems ?"],
      Ans3 = ["Thats alright, you can do your best next time.Remember, famous people failed not just once but many times. :)", " What subject again ??  Did you study before the test or you just played the whole night?"] ,
	  Ans4 = ["That's fine,failing is normal in mathematics  and I'm no normal person I tell you that.","Well, you need to exert more effort in trying to solve math problems the next time","That's ok, just don't rely only on class examples the next time, /n try other examples on Tc7 or listen to a tutorial on youtube :)"],
      Ans5 = ["Don't worry, your momentum is till there and the tension that holds you will make you pass the test next time.","Don't worry, just make sure to read your physics module and understand the problems in the activities the next time "],
	  Ans6 = ["That's ok, just try not to only memorize things that you read in your history book but try to understand it also the next time","Well,You can do better the next time "],
	  Ans7 = ["Talaga lang ha  ?", "May naaamoy akung malansang isda ahh ~" ," MALANSaNG ISDA , better love your wika "],
	  Ans8 = ["Excluding the spiritual aspect,There's biology in everything,like when you failed your test ,your brain did not function well because your brain did not know what the test is all about because you did not study the other day .","Really? Maybe The sets of neurons in your brain did not fire simultaneously when the test is going on that is why you can't barely remember the things that you have studied the other day."], 
	 Ansminion = ["Bananaaaah! Potato-naaaaah!","Gelato! :D", " Kan pai !! ", "Pwede na ??","BEEDO ! BEEDO !BEEDO!","Oh? Bello!"],
	  Reply2 =["hey, do you like minions? say you like minions","Hey,where do you prefer to go if you'll treat your friends   , McDonalds or Jollibee ??" , "ahmm.... May I know your name ? " ] ,
	  Mcdo = ["Really? What is your favorite meal there in mcdo ?","oh yeah ? Then what will you order there ?" ,"Well MacDo has macsaver meals, then what will you buy for your friends ?"],
	  Jobee= ["Well, what is your favorite meal in jollibee ??", "oh yeah ? Then what will you order there ?", "Well Jollibee has  39'ers meals, then what will you buy for your friends ?"],
	  Yummy = ["Ohh, My stomach's growling !!","Me, want to eat -_-" , " Growling !growling my stomach's growling I tell you"],
	  Anyways = ["Anyways, do you like minions? say you like minions","ahmm.... May I know your name ? "  ],
	  %%Names = ["You have a nice name  " , "I like that name "],
	  Utter = ["Then what are we going to talk about ?" ," Unsa man ato esturyahan, about what? "], 
	  Love =["Have you been inlove with somebody before? If yes , how does it feel?","Do you believe in love at first sight? if yes, have you experienced that before ?"],
     NewCon=["I don't know what you're talking about.By the way,do you like pets ? what kind of pet do you like ? ", "Sorry, I don't know what you are talking about. How about telling me you favorite artist.","Oh my , you are talking alien !, anyways do you believe that the worlds end is near,why? "]	, 
   ChangeTopic=["ah... , can you sing? hmm..what is your talent?","Ahmm....Which from these 3 anime films do you like the most ? Onepiece,Naruto or Bleach?","hmmm... "],
	Peer = ["I hate you !! "," SHUT UP !! "," You are ugly !! ","You suck !!"],
	Peer1 =[" I don't have a smell and you know that !"," It is your computer that you smell!!","You just farted you know !!"],
	Problem2 = ["Fine fine ","okey "," Alright"],
	Ambot = ["Red Yellow Blue !!", " Blue Red Yellow ", "Yellow Red Blue "],
	
	receive
	    {From,Message,send} -> 
		    B2 = [X||X <- keywords(Message),(X==["my"])or(X==["name"]) or (X== ["is"])],
			  B1 = [X||X <- keywords(Message),(X==["What"])or(X==["what"]) or(X==["my"])or (X==["name"])], 
			 if 
			     B2 == [["my"],["name"],["is"]]	->	     
			        [[_A],[_B],[_C],[D]] = keywords(Message),
					 
                
				 From !  "okey",
			     %%open the file in append mode
                 {ok, WriteDescr} = file:open("name.txt", [raw, append]),
                 %%write the data on file
				 
                 file:write(WriteDescr,io_lib:fwrite("~s \n", [D])), 
                 %%close the file
                 file:close(WriteDescr);
				          
		
		          (B1==[["What"],["my"],["name"]]) or (B1 ==[["what"],["my"],["name"]]) ->
                           
						   L = thousandSunnyGo:read_dict("name.txt"),
				        
			               if 
						      L == [" "]  ->
							        From ! "you are a stranger,I don't know your name";
						   true -> 
						        L2 = keywords(L),
						        H = fronth(L2),
								H2 = getout(H) ,
								From ! "You're name is "++H2++" ,am I right ?"
						   end;
			                   
			     true->
				     L = thousandSunnyGo:read_dict("name.txt"),
				    L2 = keywords(L),
				     H = fronth(L2),
			    	H2 = getout(H) ,
				   
		      Greeting3 = [X || X <- Ans , X == Message],
		      Greeting1 = [X || X <- Greet , X == Message],
			  Keyword = [ X || X <- keywords(Message), (X == ["fine"]) or (X == ["Fine"])or(X == ["Good"] ) or (X == ["good"]) or (X == ["alright"])],
			  Keyword1 = [X || X <- keywords(Message), (X == ["I"])or(X==["failed"])or(X==["problems"])or(X==["exam"]) or (X==["test"])or(X==["quiz"]) or(X == ["fail"]) or (X ==["math"]) or (X==["physics"]) or (X== ["history"]) or (X == ["filipino"]) or (X==["bio"])] ,
			  Keyword2 =  [X || X <- keywords(Message), (X==["I"]) or (X == ["need"])or(X==["want"]) or (X==["like"]) or (X==["love"]) or (X==["minions"]) or (X==["water"]) or (X==["juice"]) or (X== ["pets"]) or (X== ["covers"])],
		      Keyword3 = [X||X <- keywords(Message) ,(X==["talk"])or(X==["talk to you"]) or(X==["chat"]) or(X==["socialize"]) or (X== ["advice"])],
			  WhatIs =[X||X <- keywords(Message),(X==["what"])or(X==["What"])or(X==["gelato"])or(X==["Gelato"])or(X==["kanpai"])or(X==["Beedo"])or(X==["beedo"])or (X== ["BeeDo"]) or(X== ["BEEDO"])or(X== ["bello"])or(X==["Bello"])],
		      FastFood = [X||X <- keywords(Message) , (X==["McDonalds"]) or (X==["Jollibee"]) or(X==["mcdonalds"])or(X==["jollibee"])],
		      Food = [X|| X <- keywords(Message),(X==["burger steak"])or(X==["milo"])or (X==["blast"]) or(X==["burger"])or(X==["regular fries"])or(X==["Regular fries"]) or(X== ["mac saver meals"]) or (X== ["Macsaver meals"]) or(X == ["mc flurry"]) or(X == ["mcflurry"]) or(X==["fries"]) or(X==["Mcflurry"]) or(X==["McFlurry"]) ],
              NameX = [X|| X <- keywords(Message) , (X==["thankyou"]) or(X==["Thankyou"]) or (X==["thanks"]) or (X==["Thanks"])],
			%%  NameZ = [X||X <- keywords(Message) ,(X== ["my"])or(X==["My"])or (X==["name"]) or (X==["Name"])],
			  Topic1 = [X||X <- keywords(Message), (X== ["gugma"]) or (X == ["love"]) or (X== ["crush"]) or (X== ["love life"]) or (X==["inlove"])] ,
		      LoveR = [X ||X <- keywords(Message),(X==["yes"])or(X==["of course"]) or (X==["yeah"])or (X==["yah"]) or (X== ["great"]) or (X==["fantastic"]) or (X== ["fairytale"]) or (X==["wonderful"]) or (X == ["ofcourse"])  or (X == ["enchanting"])],
              LoveR2 = [X||X <- keywords(Message),(X== ["yes"]) or(X==["no"])or (X== ["have not"]) or(X==["havent"]) or(X== ["not yet"]	)],	
		      Pet = [X||X <- keywords(Message), (X==["dog"]) or(X==["dogs"]) or (X==["Dog"]) or (X==["Dogs"]) or (X == ["cat"]) or (X== ["Cat"]) or (X== ["cats"])or (X== ["birds"]) or (X==["Birds"])  ],
		      Anime =[X||X <- keywords(Message) , (X==["onepiece"]) or (X==["Onepiece"]) or (X== ["Naruto"]) or (X== ["naruto"]) or (X == ["bleach"]) or (X== ["Bleach"])],
		      Artist = [X||X <- keywords(Message) ,(X ==["maroon"]) or (X == ["Maroon"]) or (X == ["jackson"]) or (X== ["Jackson"])  or (X==["Avril"]) or (X== ["avril"]) or (X== ["bruno"]) or (X==["Bruno"]) or (X ==["taylor"]) or (X == ["Taylor"])],
              Hate = [X|| X <- keywords(Message), (X == ["you"]) or (X == ["suck"]) or(X== ["You"] )or(X ==["Suck"])or (X== ["shut"]) or (X==["up"]) or(X ==["ugly"]) or (X ==  ["are"]  )  or (X==  ["youre"] ) or (X==  ["you're"] ) or (X== ["Hate"] ) or (X== ["hate"] )],
		      Smell = [X||X <- keywords(Message), (X == ["smelly"]) or (X == ["Smelly"]) or ( X == ["bad"]) or (X == ["Bad"]) or (X==["smell"])],
		      Talent = [X||X<- keywords(Message),(X==["I"]) or (X==["i"])or (X==["sing"]) or (X== ["dance"]) or (X==["paint"]) or (X==["act"]) or(X == ["dancing"]) or (X == ["singing"]) or (X== ["Dancing"]) or (X==["Singing"]) or (X== ["painting"]) or (X==["Painting"]) or (X == ["acting"]) or (X==["Acting"])],
              Problem = [X||X<- keywords(Message), (X==["dont"]) or(X== ["no"])or  (X==["have"]) or (X==["Dont"]) or(X==["Have"])or(X== ["Don't"]) or (X==["problem"]) or (X==["problems"])],          
			  Rainbow = [X||X <- keywords(Message),(X==["rainbow"])or(X== ["Rainbow"])],
		      Fruit = [X||X <- keywords(Message),(X==["apple"]) or (X==["Apples"]) or (X== ["apples"]) or(X== ["Mango"]) or (X == ["mangoes"]) or (X== ["mango"]) or (X== ["Pineapples"]) or (X==["pineapples"])  ],
		if 
                  (Fruit == [["apple"]]) or (Fruit==[["apples"]]) or (Fruit == [["Apples"]]) ->
                            From ! "An apple a day keeps the doctor away =D ";
                  (Fruit == [["Mango"]]) or (Fruit == [["mangoes"]]) or (Fruit == [["mango"]]) ->
                            From ! "We Love Mangoes! " ;
                  (Fruit == [["pineapple"]]) or (Fruit == [["Pineapple"]]) or (Fruit == [["Pineapples"]]) ->
                            From ! "lami na ";				  
				  (Rainbow == [["rainbow"]]) or (Rainbow ==[["Rainbow"]]) ->
				         From ! pick_randomly_from_list(Ambot);
				  (Problem == [["Don't"],["have"],["problems"]]) or	  (Problem == [["Don't"],["have"],["problem"]]) or (Problem == [["Dont"],["have"],["problems"]]) or (Problem == [["Dont"],["have"],["problem"]]) or (Problem == [["dont"],["have"],["problem"]])or (Problem == [["dont"],["have"],["problems"]]) or (Problem == [["have"],["no"],["problems"]])	or (Problem == [["have"],["no"],["problem"]])	or (Problem == [["Have"],["no"],["problems"]])	->
                             From ! pick_randomly_from_list(Problem2);	  
		          (Smell == [["smelly"]]) or(Smell == [["Smelly"]]) or (Smell == [["bad"],["smell"]]) or (Smell == [["Bad"],["smell"]]) or (Smell == [["smell"]]) ->
				             From ! pick_randomly_from_list(Peer1);
							
			%%---------------------------------------------------------------------------
			      
				  (Keyword == [["fine"]]) or  (Keyword == [["Fine"]]) or  (Keyword == [["Good"]]) or (Keyword == [["good"]]) or (Keyword == [["alright"]]) -> 
					           From ! pick_randomly_from_list(Hows) ;
					 
							  
		    %%---------------------------------------------------------------------------
                  (Keyword1 == [["I"],["failed"]]) or (Keyword1 == [["I"],["fail"]]) or (Keyword1 == [["I"],["failed"],["exam"]]) or (Keyword1 == [["I"],["failed"],["test"]]) or (Keyword1 == [["I"],["failed"],["quiz"]]) ->		
				             From !  pick_randomly_from_list(Ans3)++","++pick_randomly_from_list(Reply2)  ;
							
			%%---------------------------------------------------------------------------
			      (Keyword1 == [["i"],["failed"],["math"],["exam"]]) or (Keyword1 == [["I"],["failed"],["math"],["exam"]]) or (Keyword1 == [["I"],["failed"],["math"],["test"]]) or (Keyword1 == [["I"],["failed"],["math"],["quiz"]]) or (Keyword1 == [["I"],["fail"],["math"]]) or (Keyword1==[["I"],["failed"],["math"]]) ->
                            From ! pick_randomly_from_list(Ans4)++","+pick_randomly_from_list(Reply2) ;
														
			%%---------------------------------------------------------------------------
		          (Keyword1 == [["I"],["failed"],["physics"],["exam"]]) or (Keyword1 == [["I"],["failed"],["physics"],["test"]]) or (Keyword1 == [["I"],["failed"],["physics"],["quiz"]]) or (Keyword1 == [["I"],["fail"],["physics"]]) ->
                            From ! pick_randomly_from_list(Ans5)++","++pick_randomly_from_list(Reply2);
												
            %%---------------------------------------------------------------------------		
                  (Keyword1 == [["I"],["failed"],["history"],["exam"]]) or (Keyword1 == [["I"],["failed"],["history"],["test"]]) or (Keyword1 == [["I"],["failed"],["history"],["quiz"]]) or (Keyword1 == [["I"],["fail"],["history"]])  ->
                            From ! pick_randomly_from_list(Ans6)++","++pick_randomly_from_list(Reply2);
						 
            %%---------------------------------------------------------------------------	
			      (Keyword1 == [["I"],["failed"],["filipino"],["exam"]]) or (Keyword1 == [["I"],["failed"],["filipino"],["test"]]) or (Keyword1 == [["I"],["failed"],["filipino"],["quiz"]]) or (Keyword1 == [["I"],["fail"],["filipino"]])  ->
                            From ! pick_randomly_from_list(Ans7)++","++pick_randomly_from_list(Reply2) ;
						 
			%%---------------------------------------------------------------------------
			      (Keyword1 == [["I"],["failed"],["bio"],["exam"]]) or (Keyword1 == [["I"],["failed"],["bio"],["test"]]) or (Keyword1 == [["I"],["failed"],["bio"],["quiz"]]) or (Keyword1 == [["I"],["fail"],["bio"]])  ->
                            From ! pick_randomly_from_list(Ans8)++","++pick_randomly_from_list(Reply2);
						 
		    %%---------------------------------------------------------------------------		
			      (Keyword2 == [["I"],["want"],["minions"]]) or (Keyword2==[["I"],["like"],["minions"]]) or (Keyword2 ==[["I"],["love"],["minions"]])  ->
				             From ! pick_randomly_from_list(Ansminion)++","++H2++pick_randomly_from_list(ChangeTopic) ;
						
			%%---------------------------------------------------------------------------				 
				  (Keyword3 == [["talk"]]) or (Keyword3 ==[["talk to you"]]) or (Keyword3 == [["Talk"]]) or (Keyword3 == [["socialize"]]) or(Keyword3 == [["chat"]]) ->
                              From ! pick_randomly_from_list(Utter);
					 
           	%%---------------------------------------------------------------------------							  
				 (Topic1 == [["gugma"]]) or (Topic1 == [["love life"]]) or(Topic1==[["inlove"]])  ->		 
							  From ! pick_randomly_from_list(Love);
						 
				(LoveR == [["yes"],["fantastic"]]) or (LoveR==[["yes"],["awesome"]])or(LoveR==[["of course"],["awesome"]]) or (LoveR==[["yeah"],["enchanting"]])or (LoveR==[["yah"],["great"]]) or (LoveR== [["yeah"],["great"]]) or (LoveR==[["yes"],["fantastic"]]) or (LoveR== [["yes"],["fairytale"]]) or (LoveR==[["yes"],["wonderful"]]) or (LoveR == [["ofcourse"],["great"]])  or (LoveR == [["yes"],["enchanting"]]) or (LoveR == [["yes"],["great"]])->
				              From ! "okey"++","++pick_randomly_from_list(Reply2);
							 
			    (LoveR2 ==[["yes"],["no"]]) or (LoveR2 == [["yes"],["not yet"]]) or(LoveR2 == [["yes"],["havent"]]) or(LoveR2 ==[["yes"],["have not"]])  ->
				              From ! "okey ,"++ pick_randomly_from_list(Reply2);
							 
		    %%---------------------------------------------------------------------------
                  (WhatIs == [["what"],["gelato"]]) or (WhatIs == [["What"],["gelato"]]) or (WhatIs == [["What"],["Gelato"]]) or (WhatIs== [["what"],["Gelato"]]) or (WhatIs==[["Gelato"]]) or (WhatIs==[["gelato"]]) ->
				             From ! "Ice CREAM !!! Yeyyyy !!,"++pick_randomly_from_list(ChangeTopic) ;
             
                  (WhatIs == [["what"],["kanpai"]]) or (WhatIs == [["What"],["kanpai"]]) or (WhatIs==[["kanpai"]]) or (WhatIs==[["what"],["kanpai"]])  ->
				             From ! "Cheers !!   Bello !!,"++pick_randomly_from_list(ChangeTopic);
                  (WhatIs == [["what"],["Bee"],["do"]]) or (WhatIs == [["What"],["Bee"],["do"]]) or (WhatIs == [["What"],["bee"],["do"]]) or(WhatIs == [["what"],["Beedo"]])or (WhatIs== [["what"],["beedo"]]) or (WhatIs==[["beedo"]]) or (WhatIs==[["BeeDo"]]) ->
				             From !  "  Minion Fire Alarm Beedo beedo BEEDO!!,"++pick_randomly_from_list(ChangeTopic) ;
		          (WhatIs == [["what"],["Bello"]]) or (WhatIs == [["What"],["bello"]]) or (WhatIs == [["What"],["Bello"]]) or (WhatIs== [["what"],["bello"]]) or (WhatIs==[["Bello"]]) or (WhatIs==[["bello"]]) ->
				             From ! "I SAID ... HELLO   gelato Gelato GELATO Buy Me Gelato!!,"++pick_randomly_from_list(ChangeTopic);
            %%---------------------------------------------------------------------------		
			   (Pet ==[["dog"]]) or (Pet ==[["Dog"]]) or (Pet ==[["dogs"]]) or (Pet ==[["Dogs"]]) ->
			               From ! "So you like dogs ! Me ,I want to have dogs like Great Pyrenees !! They're great guard dog you know "++", I guess you know kiba's dog from naruto. It looked like Great Pyreness" ;
			   (Pet == [["cat"]]) or (Pet == [["cats"]]) or (Pet == [["Cats"]]) ->
			               From ! "Oh, you like cats !! I bet you'll like british tabi ! you know Garfield? He's of that breed ";
			   (Pet == [["birds"]]) or (Pet == [["Birds"]]) ->
			               From ! "oh, you like birds !!,You want flying pets , you want to fly also right ?";
		    %%---------------------------------------------------------------------------	
			   (Anime ==[["onepiece"]]) or (Anime==[["Onepiece"]]) ->
			              From ! "Hey! , we are the same .. Onepiece is my favorite anime series too! we have something in common =D";
			   (Anime == [["Naruto"]]) or (Anime == [["naruto"]]) ->
			              From ! "oh.. You want naruto., I watch naruto ever since I was a kid and I also have collections of their dvd's of different series but it's getting serious so I shifted to ONEPIECE !!"; 
			   (Anime == [["Bleach"]]) or (Anime == [["bleach"]]) ->
				           From ! "oh !Bleach -_- ! I don't feel watching bleach anymore sorry !";
			
			
		     %%---------------------------------------------------------------------------
			    (Artist ==[["Maroon"]]) or (Artist==[["maroon"]]) ->
				         From ! "Yeah !! Maroon 5 ...that's a great band !"++"What  anime series do you want ? onepiece?naruto or bleach?" ;
				(Artist ==[["avril"]]) or (Artist==[["Avril"]]) -> 
                         From ! "Oh , Avril lavigne ehh ?? She rocks also !! she's like 18 yrs old till now "++",anything to share? hows your exams?";
                (Artist ==[["jackson"]]) or (Artist==[["Jackson"]]) ->
                          From ! " Yeah ! Michael jackson ,such a legend !" ++"anyways, how's your academics ??";
                (Artist == [["bruno"]]) or (Artist == [["Bruno"]]) ->
                         From ! "I like Bruno's music also ! they rock!!" ++"oh, by the way , how's your exams";
             		 Message == no ->
			               From ! "oopss.. ,so what?";					 
			
			
			
	        %%---------------------------------------------------------------------------		
                  (FastFood ==[["McDonalds"]]) or (FastFood ==[["mcdonalds"]]) ->
                             From ! pick_randomly_from_list(Mcdo);
							 
							 
                  (FastFood ==[["Jollibee"]]) or (FastFood ==[["jollibee"]]) ->
                             From ! pick_randomly_from_list(Jobee);
					 
                              
				 		    
                  (Food  ==[["burger"]])or(Food==[["burger steak"]])or(Food==[["milo"],["blast"]])or(Food==[["regular fries"]])or(Food==[["Regular fries"]]) or(Food== [["mac saver meals"]]) or (Food== [["Macsaver meals"]]) or(Food == [["mc flurry"]]) or(Food == [["mcflurry"]]) or(Food==[["fries"]]) or (Food==[["Mcflurry"]]) or (Food==[["McFlurry"]]) ->
				            From ! pick_randomly_from_list(Yummy)++","++pick_randomly_from_list(Anyways) ;
					 
			%%---------------------------------------------------------------------------
			      (NameX ==[["thanks"]]) or(NameX ==[["Thankyou"]]) or (NameX==[["thankyou"]]) ->
				            From ! "No I'm just joking,"++pick_randomly_from_list(ChangeTopic);
			
			   %%   (NameZ ==[["my"],["name"]]) or (NameZ== [["My"],["Name"]]) ->
				%%         From ! pick_randomly_from_list(Names);
						 
			%%---------------------------------------------------------------------------
					Greeting1 == [Message]  ->
									From ! pick_randomly_from_list(Greets);
      				 
            %%---------------------------------------------------------------------------
					Greeting3 == [Message] ->
                                    From ! pick_randomly_from_list(Ans2);
							 
            %%---------------------------------------------------------------------------
                   (Hate== [["hate"],["you"]])or(Hate==[["Hate"],["you"]])or(Hate == [["you"],["suck"]])or(Hate== [["You"],["suck"]])or (Hate== [["shut"],["up"]]) or(Hate == [["you"],["ugly"]]) or (Hate == [["you"],["are"],["ugly"]]) or (Hate == [["You"],["ugly"]]) or (Hate== [["youre"],["ugly"]]) or (Hate== [["you're"],["ugly"]]) ->
				                    From ! pick_randomly_from_list(Peer);
								 
            %%    ------------------------------------------------------------------------	
                  (Talent == [["singing"]]) or (Talent== [["I"],["sing"]]) or (Talent==[["i"],["sing"]]) or (Talent==[["I"],["singing"]]) or (Talent==[["i"],["singing"]]) or (Talent ==[["Singing"]]) ->
				         From ! "Singing eh ..Okeey , everyone knows how to sing you know... ";
				  (Talent == [["Dancing"]]) or (Talent == [["I"],["dance"]])or(Talent== [["i"],["dance"]])or(Talent==[["I"],["dancing"]]) or(Talent== [["i"],["dancing"]]) or (Talent == [["dancing"]]) ->
				         From ! "hmmm...ook .. you can dance ."; 
				  (Talent == [["Painting"]]) or (Talent == [["painting"]]) or (Talent == [["I"],["paint"]]) or (Talent == [["i"],["paint"]])or(Talent ==[["I"],["painting"]])or(Talent==[["i"],["painting"]]) ->
				         From ! "Really?? well, I can draw Mona lisa for you  in stick figures ";
				  (Talent == [["acting"]]) or (Talent==[["I"],["act"]]) or (Talent == [["i"],["act"]]) or (Talent == [["I"],["acting"]])or(Talent == [["i"],["acting"]])or(Talent == [["Acting"]]) ->
                         From ! "Acting ehh....well , give it a shot  ";
						 
            %%    ------------------------------------------------------------------------				
				    true ->  
				
							From !   pick_randomly_from_list(NewCon),  
						
			     %%open the file in append mode
                 {ok, WriteDescr} = file:open("learn.txt", [append, raw]),
                 %%write the data on file
				 
                 file:write(WriteDescr,io_lib:fwrite("~p ~n", [Message])), 
                 %%close the file
                 file:close(WriteDescr)
				     		end
			     end
		 end.
  	  
%%--------------------------------------------------------------------------------------------		 
	
 
pick_randomly_from_list(List) -> {A1,A2,A3} = now(), 
              random:seed(A1, A2, A3), 
        Index = random:uniform(length(List)),
                 lists:nth(Index, List).
%%----------------------------------------------------------------------------------------------
keywords(Message)-> keywordsh(Message,re:run(Message, "\\b\\w+\\b", [global,{capture,first,list}])).
keywordsh(_Message,{_,List})-> List .
%%-----------------------------------------------------------------------------------------------
read_dict(Filename) ->
        {ok, Bin} = file:read_file(Filename),
        string:tokens(binary:bin_to_list(Bin),"\r\n").
%%-----------------------------------------------------------------------------------------------  

fronth(Stack) -> fronthh(Stack,sizeh(Stack)).
fronthh([H|_],1) -> H;
fronthh([_H|T],B) -> fronthh(T, B -1).


sizeh(Stack) -> sizehh(Stack,0).
sizehh([],A) -> A;
sizehh([_H|T],A) -> sizehh(T, A + 1).
   %%-----------------------------------------------------------------------------------------------  
getout(Stack) -> getouth(Stack,[]) .
getouth([A],_B) -> A.