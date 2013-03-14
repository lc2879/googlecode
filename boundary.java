
void printLeftMostNode(node *root) 


02 { 


03   


04 if(root==NULL) 


05   return; 


06 if(root->left != NULL) 


07  { 


08     cout<<root->data; 


09     printLeftMostNode(root->left); 


10  } 


11 else if(root->right != NULL) 


12  { 


13     cout<<root->data; 


14     printLeftMostNode(root->right); 


15  } 


16 } 


17 void printLeafNode(node *root) 


18 { 


19 if(root!=NULL) 


20   { 


21     printLeafNode(root->left); 


22      if(root->left==NULL && root->right==NULL) 


23        cout<<root->data; 


24      printLeafNode(root->right); 


25   } 


26 } 


27 void printRightMostNode(node *root) 


28 { 


29    if(root==NULL) 


30      return; 


31    if(root->right!=NULL) 


32     { 


33       printRightMostNode(root->right); 


34       cout<<root->data; 


35     } 


36    else if(root->left!=NULL) 


37     { 


38       printRightMostNode(root->left); 


39       cout<<root->data; 


40     } 


41 } 

