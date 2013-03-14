#include <vector>
#include <iostream>
using namespace std;
void print( vector<int> v){
	vector<int>::iterator it ;
	for( it = v.begin(); it != v.end(); ++it )
		cout << *it << " " ;
}

struct Node{
	Node* 	left;
	Node* 	right;
	int 	value;
};

int maxPath( Node* n, vector<int> &path ){
	if( n != NULL ){
		//cout<<n->value<<endl;
		vector<int> leftPath;
		int leftMax = maxPath( n->left, leftPath );

vector<int> rightPath;
		int rightMax = maxPath( n->right, rightPath );

path = leftMax > rightMax ? leftPath : rightPath;
		int ret = leftMax > rightMax ? leftMax : rightMax;

path.push_back( n->value );
		
		return ret + n->value;
	}
	else
		return 0;
	
}

int main(){
	Node* root = new Node;
	root->value = 1;
	root->left = new Node;
	root->left->value = 2;
	root->right = new Node;
	root->right->value = 3;
	root->right->left = new Node;
	root->right->left->value = 4;

vector<int> path;
	cout<<maxPath(root,path)<<endl;
	print(path);

}
