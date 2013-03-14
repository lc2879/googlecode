public void printValue(node * root,int level, node* target,bool isleft, int d){

if(!root||!target) return;
if(isleft==true&&d>level)
	printf(root.value);
if(root.value=target.value){
printValue(root.left, target, true, d+1);
printValue(root.right, target, false, d+1);
}
else{
printValue(root.left, target, true, d+1);
printValue(root.right, target, false, d+1);
}
return;
}
