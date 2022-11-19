import random
count=0
for i in range(10):
	x=random.randint(1,100)
	y=random.randint(1,100)
	while i<2:
		print("第",i+1,"题：")
		print('{}+{}='.format(x,y),end=" ")
		a=int(input("得数为："))
		if(a==x+y):
			print("恭喜你，答对了!")
			count+=1
		else:
			print("答错了，再接再励！")
		break
	while i>=2 and i<5:
		print("第",i+1,"题：")
		print('{}-{}='.format(x,y),end=" ")
		b=int(input("得数为："))
		if(b==x-y):
			print("恭喜你，答对了!")
			count+=1
		else:
			print("答错了，再接再励！")
		break
	while i>=5 and i<7:
		print("第",i+1,"题：")
		print('{}*{}='.format(x,y),end=" ")
		c=int(input("得数为："))
		if(c==x*y):
			print("恭喜你，答对了!")
			count+=1
		else:
			print("答错了，再接再励！")
		break
	while i>=7 and i<10:
		print("第",i+1,"题：")
		print("如果除不断，给出整商即可")
		print('{}//{}='.format(x,y),end=" ")
		d=int(input("得数为："))
		if(d==x//y):
			print("恭喜你，答对了!")
			count+=1
		else:
			print("答错了，再接再励！")
		break